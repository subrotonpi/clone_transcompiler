def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = sys.stdin.read ( )
            self.N = len ( sys.stdin.read ( ) )
            self.ans = ""
            s = list ( S )
            for l , r in enumerate ( s ) :
                l -= 1
                s1 = s [ l : r ]
                ss1 = s1.split ( " " )
                s2 = ss1.reverse ( )
                st = " ".join ( s2 )
                s3 = s [ l : r ] + st
                self.ans = " ".join ( s3 )
            print ( self.ans )
