def _ ( ) : return ''
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        with open ( '/proc/self/stat' , 'r' ) as sc :
            n = sc.read ( )
    def p ( n , s ) :
        if n == 1 : return s
        else : return p ( n - 1 , s + '0' )
