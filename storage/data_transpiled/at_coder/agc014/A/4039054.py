def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.ans = 0
            while A % 2 == 0 and B % 2 == 0 and C % 2 == 0 :
                tempA = B / 2 + C / 2
                tempB = A / 2 + C / 2
                tempC = A / 2 + B / 2
                if A == tempA and B == tempB and C == tempC :
                    print ( - 1 )
                    return
                ans += 1
                A = tempA
                B = tempB
                C = tempC
            print ( ans )
