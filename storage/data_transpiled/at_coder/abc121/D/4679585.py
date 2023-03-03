def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            with self.open ( 'a' ) as f :
                A = f.read ( )
                B = f.read ( )
                answer = 0
                C = 0
                if A % 2 == 0 :
                    if B % 2 == 0 :
                        C = ( B - A ) / 2
                        if C % 2 == 0 :
                            answer = B
                        else :
                            answer = B ^ 1
                    else :
                        C = ( B - A ) / 2
                        if C % 2 == 0 :
                            answer = 1
                        else :
                            answer = 0
                else :
                    if B % 2 == 0 :
                        C = ( B - A - 1 ) / 2
                        if C % 2 == 0 :
                            answer = A ^ B
                        else :
                            answer = A ^ B ^ 1
                    else :
                        C = ( B - A ) / 2
                        if C % 2 == 0 :
                            answer = A
                        else :
                            answer = A ^ 1
            print ( answer )
    return Main
