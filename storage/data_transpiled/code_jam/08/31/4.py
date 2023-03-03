def import _solve
import os
import sys
import getopt
import getopt
import getopt
class Olymp :
    def __init__ ( self ) :
        self.INPUT_NAME = 'input.txt'
        self.OUTPUT_NAME = 'output.txt'
        self.eps = 1e-10
        def prln ( self , st ) :
            print ( st )
    def input ( self ) :
        with open ( self.INPUT_NAME , 'r' ) as sc :
            with open ( self.OUTPUT_NAME , 'w' ) as pw :
                self.kol_c = len ( sc.getopt ( ) )
                for i in range ( kol_c ) :
                    print ( )
                    print ( "New case %d" % ( i + 1 ) )
                    n , p , l = getopt.getopt ( sc.Getopt ( 'n' ) , sc.Getopt ( 'p' ) , sc.Getopt ( 'l' ) )
                    fr = [ ]
                    for j in range ( l ) :
                        fr.append ( sc.getopt ( ) [ j ] )
                    print ( solve ( ) , " " , self.solve_true )
                    pw.write ( "Case #%d: %s\n" % ( i + 1 , self.solve_true ) )
    def solve_true ( self ) :
        [ val ] = self.l - 1
        res = 0
        for i in range ( 1 , n + 1 ) :
            for j in range ( p ) :
                res += i * fr [ val ]
                val -= 1
                if val == - 1 :
                    return str ( res )
        return str ( res )
    def solve ( self ) :
        return 'No'
    def output ( self , args ) :
        ol = Olymp ( )
        ol.input ( args )
        return ol
