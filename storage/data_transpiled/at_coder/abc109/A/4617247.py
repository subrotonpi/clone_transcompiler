def _import ( ) :
    import sys
    import os
    class Main ( object ) :
        def Odd ( self , a , b ) :
            for i in range ( 1 , 3 ) :
                if ( a * b ** i ) % 2 : return True
            return False
        def Main ( self ) :
            with open ( "/proc/self/" , "r" ) as f :
                a = f.read ( )
                b = f.read ( )
                if self.Odd ( a , b ) == True : print ( "Yes" )
                else : print ( "No" )
    return Main
