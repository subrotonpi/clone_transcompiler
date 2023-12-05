def _import ( ) :
    import os
    import sys
    class A ( object ) :
        IFILE = "A-large.in"
        def __init__ ( self , f ) :
            self.IFILE = f
        def nod ( self , x , y ) :
            if x > y :
                return nod ( y , x )
            while x > 0 :
                k , x = x , y % x
                y = k
            return y
        def run ( self ) :
            f = open ( self.IFILE , 'r' )
            f.write ( "output.txt" )
            ntest = self.ntest
            for test in range ( 1 , ntest + 1 ) :
                f.write ( "Case #%d: " % test )
                n , pd , pg = f.read ( ).split ( "." )
                if not pg and pd != 0 or pg == 100 and pd != 100 :
                    f.write ( "Broken" )
                else :
                    nod = nod ( pd , 100 )
                    if n >= 100 / nod :
                        f.write ( "Possible" )
                    else :
                        f.write ( "Broken" )
