def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , data ) :
            self.cnt = 0
            for x in data :
                self.cnt += 1
                now = x
                while self.cnt < len ( x ) and x == now :
                    self.cnt += 1
            print ( self.cnt - 1 )
