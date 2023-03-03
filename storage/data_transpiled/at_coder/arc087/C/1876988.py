def main ( ) :
    import sys
    import string
    import struct
    class Main ( ) :
        class Trie :
            def __init__ ( self ) :
                self.next = [ [ ] for _ in range ( 2 ) ]
                self.states = 1
                for i in self.next :
                    [ i , i ] = - 1
            def add ( self , s ) :
                cur = 0
                for c in s :
                    c -= '0'
                    if self.next [ c ] [ cur ] == - 1 :
                        self.next [ c ] [ cur ] = states
                        states += 1
                    cur = self.next [ c ] [ cur ]
            def get ( self , len ) :
                return self.get ( 0 , len )
            def get ( self , cur , len ) :
                if len < 0 :
                    return 0
                if cur == - 1 :
                    self.cur += 1
                    return 1 << ( struct.unpack ( 'B' , self.next [ cur ] ) [ 0 ] )
                return get ( self.next [ 0 ] [ cur ] , len - 1 ) ^ get ( self.next [ 1 ] [ cur ] , len - 1 )
        def solve ( self ) :
            n , l = struct.unpack ( 'B' , self.next [ 0 ] )
            t = Trie ( )
            grundy = [ 1 ] * 100
            for i in range ( n ) :
                t.add ( struct.unpack ( 'B' , self.next [ 0 ] ) [ 0 ] )
            print ( 'Bob' if t [ l ] == 0 else 'Alice' , file = sys.stdout )
    class FastScanner ( object ) :
        def run ( self ) :
            f = open ( self.next [ 0 ] )
            f.write ( '' )
            f.close ( )
            self.solve ( )
            f.close ( )
    class FastScanner ( object ) :
        def readline ( self ) :
            try :
                f.readline ( )
            except IOError :
                pass
            return f.readline ( )
        def readline ( self ) :
            while not self.next or not self.next :
                try :
                    f.readline ( )
                except