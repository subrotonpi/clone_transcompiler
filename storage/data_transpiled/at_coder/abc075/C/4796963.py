def import import struct
from os.path import isfile
from os import urandom
from os import urandom
from random import randint
from struct import Struct
from os.path import expanduser
from os.path import join
from os.path import join
from os import sep
from os.path import join
from os import sep
from os.path import join
from os import sep
from os import chdir
from itertools import chain
n = randint ( 1 , 5 )
m = randint ( 1 , 5 )
d = { }
for a , b in zip ( range ( n ) , range ( m ) ) :
    if a in d :
        d [ a ].append ( b )
    else :
        list = [ b ]
        d [ a ] = list
    if b in d :
        d [ b ].append ( a )
    else :
        list = [ a ]
        d [ b ] = list
chdir ( '/' )
ans = 0
for a in d :
    for b in d [ a ] :
        if a < b :
            flg = [ ]
            dfs ( flg , 1 , d , a , b )
            for i in range ( 1 , n + 1 ) :
                if not flg [ i ] :
                    ans += 1
                    break
    print ( ans )
def dfs ( flg , num , d , nga , ngb ) :
    if flg [ num ] :
        return
    flg [ num ] = True
    list = d [ num ]
    if isinstance ( list , tuple ) :
        list = list ( map ( int , flg [ 0 ] ) )
    for b in list :
        if num == nga and b == ngb or num == ngb and b == nga :
            continue
        dfs ( flg , b , d , nga , ngb )
return ans
