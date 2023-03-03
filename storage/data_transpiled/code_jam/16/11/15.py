def cj2016.r1a ( ) :
    import os
    import sys
    from cj2016.r1a import solve
    class A ( object ) :
        def read ( self ) :
            sc = open ( self.file_prefix + ".in" , "r" )
            f = open ( self.file_prefix + ".out" , "w" )
            ntest = sc.count ( )
            for test in range ( 1 , ntest + 1 ) :
                read ( sc )
                f.write ( "Case #%d: " % test )
                print ( "Case #%d: " % test , end = "" )
                solve ( )
            print ( "Finished." )
            sc.close ( )
            f.close ( )
        def read ( self ) :
            S = self.read ( ).split ( "\n" )
        def write ( self , s ) :
            f.write ( self.file_prefix + ".in" )
            print ( s , end = "" )
        def pprint ( self ) :
            f.write ( self.file_prefix + ".out" )
            print ( self.file_prefix + ".out" )
        def pprint ( self ) :
            f.write ( self.file_prefix + ".out" )
            print ( self.file_prefix + ".out" )
        def solve ( self ) :
            ans = ""
            for c in S :
                s1 = ans + c
                s2 = c + ans
                ans = s1 < s2
            pprint ( self.file_prefix + ".in" )
            print ( self.file_prefix + ".out" )
