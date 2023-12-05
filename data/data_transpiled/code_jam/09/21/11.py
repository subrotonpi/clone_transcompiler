def _import ( ) : return sys.stdin
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import numpy
import itertools
import itertools
def next_ch ( ) :
    if curp >= len ( curs ) :
        curs = readline ( ) + ' '
        curp = 0
    pp = p [ cur ]
    while cur <= 32 :
        c = readline ( )
    s = '%c' % c
    if s == '(' or s == ')' :
        return s
    while True :
        c = readline ( )
        if c == ')' or s == '(' or s <= 32 :
            curp -= 1
            return s
        s = s + c
def poisk ( ) :
    s = readline ( )
    cur = last
    next ( p )
    p [ cur ] = float ( s )
    s = readline ( )
    if s == ')' :
        left [ cur ] = - 1
        right [ cur ] = - 1
    else :
        str [ cur ] = s
        if not s == '(' : raise Exception ( 'B2' )
        left [ cur ] = poisk ( )
        if not s == '(' : raise Exception ( 'B2' )
        right [ cur ] = poisk ( )
        if not s == ')' : raise Exception ( 'B3' )
    return cur
def run ( ) :
    stdin = open ( 'input.txt' , 'r' )
    stdout = open ( 'output.txt' , 'w' )
    curs = stdin.readline ( ) + ' '
    curp = 0
    _ = int ( readline ( ) )
    left = [ ]
    right = [ ]
    str = [ ]
    p = [ ]
    for __ in range ( _ ) :
        stdout.write ( 'Case #%d:' % ( __ + 1 ) )
    return p
