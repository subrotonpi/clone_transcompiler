#!/usr/bin/env python3
# -*- coding: utf-8 -*-

# ??????AC 
#
# ?????A???????A??????A???????????
#
# ?A?????????????S?????????????????????
# ?A?????????????T??????????????????
#
# ???????????????

import array
from bisect import *
from collections import *
import fractions
import heapq
from itertools import *
import math
import random
import re
import string
import sys

N, A = map(int, input().split())
Xs = list(sorted(map(int, input().split())))

lower = []
same = 0
upper = []
for x in Xs:
    if x < A:
        lower.append(A - x)
    elif x == A:
        same += 1
    else:
        upper.append(x - A)

def make_counter(nums):
    counter = Counter({0: 1})
    for n in nums:
        new_counter = Counter()
        for k, v in counter.items():
            # ????????????????????????
            new_counter[k] += v
            new_counter[k + n] += v
        counter = new_counter
    return counter

lower_counter = make_counter(lower)
upper_counter = make_counter(upper)

ans = 0
for lk, lv in lower_counter.items():
    # (i) A?????????
    if lk == 0:
        # ?????????????????-1
        ans += 2 ** same - 1
    # (ii) ????
    else:
        # A??????????A????????????????????A
        if lk in upper_counter:
            ans += (2 ** same) * lv * upper_counter[lk]

print(ans)