def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.ans = 0
            while A % 2 == 0 and B % 2 == 0 and C % 2 == 0 :
                if A == B and B == C :
                    print ( - 1 )
                    return
                tmp_A = A
                tmp_B = B
                tmp_C = C
                self.ans += 1
                A = tmp_B // 2 + tmp_C // 2
                B = tmp_A // 2 + tmp_C // 2
                C = tmp_A // 2 + tmp_B // 2
            print ( self.ans )
