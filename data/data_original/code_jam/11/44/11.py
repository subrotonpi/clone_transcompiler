#!/usr/local/bin/python2.7
#coding=UTF-8

# Copyright © 2009-2011 by T. Chan.

# Reading start: 
# Code start:    
# Test pass:     
# Small dl:      
# Small run:     
# Small accept:  
# Large dl:      
# Large run:     
# Large submit:  
# Complete:      


from __future__ import division
#from __future__ import absolute_import,with_statement
#from __future__ import print_function
import __builtin__,sys,os,os.path,re,time,StringIO as io
import operator,array,itertools,bisect
import pprint,pdb,traceback,warnings
from pdb import set_trace as debug
from math import hypot,pi,sin,cos,tan,sqrt,floor,ceil,asin
from itertools import islice,izip,imap
try:
	import collections
	from collections import namedtuple
except: pass
try: from math import fsum
except: warnings.warn("math.fsum() not supported; aliasing it to sum"); fsum = sum
if not 'set' in __builtin__.__dict__: from sets import Set as set,ImmutableSet as frozenset

class Point(object):
	__slots__ = ('connections','nexts','dist')
	def __init__(self):
		self.connections = set()
		self.nexts = None
		self.dist = None

def process2(P,Ws):
	Ps = tuple(Point() for i in xrange(P))
	for s,t in Ws:
		Ps[s].connections.add(t)
		Ps[t].connections.add(s)
	unp = collections.deque([1])
	Ps[1].dist = 0
	while unp:
		p = Ps[unp.popleft()]
		d = p.dist+1
		for c in p.connections:
			q = Ps[c]
			if q.dist is None:
				q.dist = d
				unp.append(c)
	unp = collections.deque([0])
	while unp:
		p = Ps[unp.popleft()]
		if p.nexts is not None:
			continue
		nexts = []
		cons = frozenset(p.connections)
		p.connections = cons
		dist = p.dist - 1
		for c in cons:
			q = Ps[c]
			assert q != p
			if q.dist == dist:
				nexts.append(c)
				unp.append(c)
		p.nexts = tuple(nexts)
	Ps[1].connections = frozenset()
	states = set([(0,frozenset([0])|Ps[0].connections)])
	dist = Ps[0].dist
	while dist:
		newstates = set()
		for p,threats in states:
			p = Ps[p]
			assert p.dist == dist
			for n in p.nexts:
				q = Ps[n]
				newstates.add((n,threats|q.connections))
		states = newstates
		dist -= 1
	dist = Ps[0].dist
	best = 0
	for p,threats in states:
		best = max(best,len(threats))
	return '%d %d'%(dist-1, best-dist)

def process(f_, out = None):
	T_, = map(int,f_.readline().strip().split())
	for X_ in range(1,T_+1):
		P,W = map(int,f_.readline().strip().split())

		Ws = tuple(map(int,x.split(',')) for x in f_.readline().strip().split())
		assert len(Ws) == W
		output = process2(P,Ws)
		#output = '%d'%output
		#output = '%.6f'%output
		
		out.write('Case #%d: %s\n' % (X_,output))
		out.flush()

TEST_DATA=(r'''
4
2 1
0,1
3 3
0,1 1,2 0,2
5 5
0,4 0,2 2,4 1,2 1,4
7 9
0,6 0,2 0,4 2,4 3,4 2,3 3,5 4,5 1,5
	Case #1: 0 1
Case #2: 0 2
Case #3: 1 2
Case #4: 2 4

''',
#r'''  '''
)

# Running
def assertdebug(func):
	try:
		assert False
		return func
	except AssertionError:
		pass
	def pmfunc(*args,**kwargs):
		try:
			return func(*args,**kwargs)
		except:
			traceback.print_exc()
			pdb.post_mortem()
			raise
	return pmfunc
process=assertdebug(process)

def process_test(d):
	f_ = io.StringIO(d)
	out = io.StringIO()

	process(f_,out)

	ret = out.getvalue()
	return ret

def process_file(fn,auto=False):
	if fn.endswith('.in'):
		base = fn[:-3]
	elif fn.endswith('.in.txt'):
		base = fn[:-7]
	else:
		base = fn

	i = 0
	while True:
		path = '%s.out%d.txt'%(base,i)
		if not os.path.exists(path):
			break
		if auto:
			print "! %s exists"%path
			return
		i += 1
	print ">> %s"%path
	f_ = open(fn,'rb')
	out = open(path,'wb')

	process(f_,out)

	f_.close()
	out.close()

def main():
	def td(d):
		if isinstance(d,str):
			d=d.split('Case #1:',1)
			return d[0].strip(), 'Case #1:' + d[1].rstrip() + '\n'
		return d
	
	def ts(prefix='>',old=[None]):
		t = time.time()
		diff = (old[0] is not None) and ' d%.6f'%(t - old[0]) or ''
		old[0] = t
		print '%s %s %.6f%s'%(prefix,time.strftime('%F %T %z',time.gmtime(t)),t,diff)

	l = sys.argv[1:]
	auto=False
	if not l:
		ts('t')
		for test_data in TEST_DATA:
			if not test_data.strip():
				return
			test_input,expected_output=td(test_data)
			my_output = process_test(test_input)
			if my_output != expected_output:
				print >>sys.stderr, "!!! Wrong output."
				print >>sys.stderr, my_output
				return
			ts('v')
		mydir,myfile = os.path.split(os.path.join(os.path.curdir,__file__))
		assert os.path.abspath(mydir) == os.path.abspath(os.path.curdir)
		if myfile.endswith('.py') and len(myfile) == 4:
			expr = re.compile(r'\A%s\-(?:large|small-attempt[0-9]|(?:large|small)\-practice)\.in(?:\.txt)?\Z'%myfile[0].upper())
			auto=True
			for f in os.listdir(mydir):
				if expr.match(f):
					l.append(f)
	for x in l:
		ts('@')
		print '>> %s'%x
		process_file(x,auto=auto)
	ts('=')

if __name__ == '__main__':
	main()