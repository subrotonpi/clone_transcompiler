def import import sys , string , traceback
from os import urandom
from random import randint
from sys import stdin , stdout
from os import urandom
from os import urandom
from os import urandom
from os.environ import dict
from os import environ
from os.environ import dict
n = int ( stdin.read ( ) )
m = int ( stdin.read ( ) )
a = [ ]
b = [ ]
for i in range ( n ) :
    a.append ( stdin.read ( ) )
for i in range ( m ) :
    b.append ( stdin.read ( ) )
pos = False
out :
    for i in range ( 0 , n - m ) :
        for j in range ( 0 , n - m ) :
            bre = False
            for k in range ( m ) :
                if not b [ k ] == a [ i + k ] [ j : j + m ] :
                    bre = True
                    break
            if not bre :
                pos = True
                break out
    if pos :
        print ( "Yes" )
    else :
        print ( "No" )
