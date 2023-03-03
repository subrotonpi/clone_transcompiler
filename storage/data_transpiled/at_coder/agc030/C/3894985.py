def import import *
import sys
import string
import string
import os
import sys
class Main ( object ) :
    def run ( self ) :
        k = len ( sys.stdin.readline ( ) )
        n = ( k + 3 ) // 4 * 2
        out.write ( n )
        for i in range ( n ) :
            for j in range ( n ) :
                c = ( i + j ) % n
                if c + n < k and i % 2 == 1 :
                    c += n
                if k == 1 :
                    c = 0
                out.write ( c + 1 )
                if j == n - 1 :
                    out.write ( "\n" )
                else :
                    out.write ( "" )
    def my_scanner ( scanner ) :
        stdstreams = True
        fname = re.sub ( "_.*" , "" , scanner.name ).lower ( )
        input_fname = fname + ".inp"
        output_fname = fname + ".out"
        locale.setlocale ( locale.LC_ALL , "" )
        if stdstreams :
            f = sys.stdin
            out = sys.stdout
        else :
            f = open ( input_fname , "r" )
            out = open ( output_fname , "w" )
        scanner = MyScanner ( f )
        tests = 1
        for test in range ( tests ) :
            yield scanner
        f.close ( )
        out.close ( )
    def my_scanner ( scanner = None ) :
        global stdstreams
        stdstreams = True
        stdstreams = True
        for i in scanner :
            stdstreams = stdstreams.get ( i )
            if i == 0 or not stdstreams :
                try :
                    stdstreams [ i ] = string.split ( scanner.name )
                except :
                    continue
            else :
                stdstreams [ i ] = string.split ( scanner.name )
        for i in range ( tests ) :
            yield scanner
