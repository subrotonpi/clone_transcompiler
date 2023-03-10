#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
GC027 C
"""

n,m = map(int,input().split())
s = bytes(input(),'utf-8')
ali = [0 for i in range(n)]
bli = [0 for i in range(n)]
import array as ar
remain = ar.array('b',[1 for i in range(n)])
from collections import defaultdict
graphAB = defaultdict(list)

for i in range(m):
    u,v=map(int,input().split())
    graphAB[u].append(v)
    graphAB[v].append(u)



def incrementAB(node,adj):
    if s[adj-1] == 65:
        ali[node-1]+=1
    if s[adj-1] == 66:
        bli[node-1]+=1

def decrementAB(node,adj):
    if s[adj-1] == 65:
        ali[node-1]-=1
    if s[adj-1] == 66:
        bli[node-1]-=1


def adjAB(node):
    if ali[node-1] and bli[node-1]:
        return(True)
    else:
        return(False)

graphvers = set(graphAB.keys())
visitset = set()
for i in range(1,n+1):
    if not i in graphvers:
        remain[i-1] = 0
    else:
        for j in graphAB[i]:
            incrementAB(i,j)
        if not adjAB(i):
            visitset.add(i)
            remain[i-1] = 0

#print(s)
while bool(visitset):
    i = visitset.pop()
    for j in filter(lambda x:remain[x-1],graphAB[i]):
        #print('loop')
        decrementAB(j,i)
        if not adjAB(j):
            visitset.add(j)
            remain[j-1] = 0

if set(remain)=={0}:
    print('No')
else:
    print('Yes')