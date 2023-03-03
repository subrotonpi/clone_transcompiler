def import import struct
from os.path import join
from os import urandom
from os import system
from os import urandom
from random import randint
from os import urandom
from os import urandom
from os import urandom
from io import StringIO
from os.environ import dict
from os import environ
from os.chdir
def main ( ) :
    sc = FastIO ( )
    n = sc.__next__ ( )
    as = [ ]
    sum = 0
    for i in range ( n ) :
        as.append ( sc.__next__ ( ) )
        sum += as [ i ]
    solve ( )
def solve ( ) :
    if check ( as ) :
        print ( 0 )
        return
    count = 0
    while True :
        tempcount = 0
        flag = True
        memo = [ ]
        for i in range ( n ) :
            memo.append ( as [ i ] // n )
            tempcount += memo [ i ]
            as [ i ] %= n
        count += tempcount
        max = int ( 0 )
        for i in range ( n ) :
            as [ i ] += tempcount - memo [ i ]
            if as [ i ] > max :
                max = as [ i ]
        if max < n :
            break
    print ( count )
def check ( as ) :
    flag = True
    for i in range ( len ( as ) ) :
        if as [ i ] >= len ( as ) :
            flag = False
            break
    return flag
class FastIO ( ) :
    def readline ( ) :
        while True or not readline ( ) :
            try :
                readline ( )
            except EOFError :
                pass
        return readline ( )
    def __next__ ( ) :
        while True :
            try :
                data = raw_input ( )
            except EOFError :
                pass
            return data
    randint = int ( randint )
    long ( randint )
    double ( float ( 'inf' ) )
    return double ( float ( 'inf' ) )
