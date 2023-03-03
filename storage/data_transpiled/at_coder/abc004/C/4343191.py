def import stdin , stdout , sys
import readline
import sys
import os
import sys
class Main ( object ) :
    stdin = sys.stdin
    stdout = sys.stdout
    def swap ( a , i ) :
        tmp = a [ i ]
        a [ i ] = a [ i + 1 ]
        a [ i + 1 ] = tmp
    def _main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as sc :
            n = sc.readline ( ).strip ( )
        c = [ 1 , 2 , 3 , 4 , 5 , 6 ]
        n %= 30
        for i in range ( n ) :
            swap ( c , i % 5 )
        for x in c :
            stdout.write ( x )
        stdout.write ( '\n' )
