def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.data = sys.stdin.read ( )
            self.boo = True
            if not self.data [ 0 ] == 'A' :
                self.boo = False
            count = 0
            index = 0
            for i in range ( 2 , len ( self.data ) - 1 ) :
                if self.data [ i ] == 'C' :
                    count += 1
                    index = i
            if count != 1 :
                self.boo = False
            for i in range ( 1 , len ( self.data ) ) :
                if i == index :
                    continue
                if self.data [ i ].isupper ( ) :
                    self.boo = False
            if self.boo :
                print ( 'AC' )
            else :
                print ( 'WA' )
