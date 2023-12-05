def _import ( ) : return sys.stdout.readline ( )
import readline
import readline
import time
import sys
import time
import sys
import sys
import os
import string
import string
import string
import string
import string
import time
MOD = 1000000007
def print ( x ) :
    print ( "%r" % x )
def print_arr ( x ) :
    s = string.join ( x , "" )
    print ( s )
def print_arr ( x ) :
    s = string.join ( x , "" )
    print ( s )
def print_arr ( x ) :
    s = string.join ( x , "" )
    print ( s )
def join ( x , space = "" ) :
    if not x :
        return ""
    s = [ ]
    first = True
    for elt in x :
        if first :
            first = False
        else :
            s.append ( space )
        s.append ( elt )
    return s
def __next__ ( ) :
    while not st or not st :
        line = readline ( )
        st = [ line.strip ( ) for line in st ]
    return st [ 0 ]
def randint ( ) :
    return int ( randint ( ) )
def main ( ) :
    f = open ( "input.txt" , "r" )
    T = randint ( )
    for t in range ( 1 , T + 1 ) :
        n = randint ( )
        if n == 0 :
            print ( "Case #%d: INSOMNIA%n" % ( t , t ) )
        else :
            digits = set ( )
            i = 1
            while True :
                cur = i * n
                while cur > 0 :
                    digits.add ( cur % 10 )
                    cur //= 10
                if len ( digits ) == 10 :
                    break
                i += 1
        print ( "Case #%d: %d" % ( t , i * n ) )
    return ''
