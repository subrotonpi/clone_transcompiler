def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.ans = 0
            for i in range ( 12 ) :
                s = self.sc.readline ( )
                for c in s :
                    if c == 'r' :
                        self.ans += 1
                        break
            print ( self.ans )
            self.sc.close ( )
    return Main ( )
