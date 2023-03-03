def _import ( ) :
    import Queue
    import Queue
    import Queue
    import Queue
    import Queue
    import Scanner
    class SegmentTree ( Queue ) :
        def __init__ ( self ) :
            self.N = 1
            while self.N < self.N : self.N *= 2
            self.data = [ ]
            self.data.append ( self.data )
        def add ( self , index , value ) :
            self.index += self.N - 1
            self.data [ index ] += value
            while self.index > 0 :
                index = ( self.index - 1 ) // 2
                self.data [ index ] += value
        def getSum ( left , right , a , b , k ) :
            if left <= a and b <= right : return self.data [ k ]
            if b <= left or right <= a : return 0
            return getSum ( left , right , a , ( a + b ) // 2 , 2 * k + 1 ) + getSum ( left , right , ( a + b ) // 2 , b , 2 * k + 2 )
        def getSum ( self , left , right ) :
            return getSum ( left , right , 0 , N , 0 )
    class Main ( object ) :
        def __init__ ( self ) :
            Scanner ( )
            s = Scanner ( )
            self.s = s
            self.char_indexes = deque ( )
            for i in range ( 26 ) :
                self.char_indexes.append ( Queue.Queue ( ) )
            self.odd = 0
            for i in range ( 26 ) :
                if len ( self.char_indexes [ i ] ) % 2 == 1 :
                    odd += 1
            if odd > 1 :
                print ( - 1 )
                return
            self.st = SegmentTree ( len ( self.s ) )
            ans = 0
            oddflag = False
            for i in range ( len ( self.char_indexes ) ) :
                nextc = self.char_indexes [ i ] - 'a'
                if self.char_indexes [ nextc ] == [ ] or self.char_indexes [ nextc ] [ 0 ] != i :
                    continue
                if self.char_indexes [ nextc ] == [ ] :
                    oddflag = True
            self.ans += ( len (