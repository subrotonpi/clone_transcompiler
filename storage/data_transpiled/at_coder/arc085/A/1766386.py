def import import sys
import time
class Main ( object ) :
    def __init__ ( self ) :
        self._main = sys._getframe ( 1 ).f_locals [ 'self' ]
    def run ( self ) :
        with open ( '/proc/self/n' , 'r' ) as sc :
            n , m = sc.read ( ).split ( )
            print ( ( 1 << m ) * ( 1900 * m + 100 * ( n - m ) ) )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
