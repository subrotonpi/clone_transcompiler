def import readline
from sys import stdin , stdout
from os import urandom
from random import randint
from time import time
from sys import maxsize
from os import O
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from random import choice
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from random import randint
from random import randint
from random import randint
from random import randint
from random import randint
from random import randint
from random import choice
from os import urandom
from os import urandom
from os import urandom
from os import urandom
from random import randint
from random import randint
from random import randint
from random import randint
from random import randint
from random import randint
from random import randint
from time import time
from random import randint
from random import randint
from random import randint
from sys
def solve ( ) :
    n = randint ( 0 , min ( n , 5 ) )
    S = next ( )
    T = next ( )
    if S == T :
        out ( 0 )
        return
    j = randint ( n - 1 , n - 1 )
    res = 0
    q = [ ]
    h = 0
    t = 0
    d = 0
    jj = n
    for i in range ( n - 1 , - 1 , - 1 ) :
        if j > i :
            j = i
        while j >= 0 and S [ j ] != T [ i ] :
            j -= 1
        if j < 0 :
            out ( - 1 )
            return
        while t > h :
            xx = randint ( 1 , min ( t , xx ) )
            if xx > i :
                h += 1
            else :
                break
        if j < i and j != jj :
            d += 1
            q.append ( ( j + d , jj ) )
            res = max ( res , t - h )
        jj = j
    out ( res )
