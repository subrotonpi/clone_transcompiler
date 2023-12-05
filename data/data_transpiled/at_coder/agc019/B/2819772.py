def import _fasta_scanner
import sys
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Fasta_scanner ( sys.stdin )
        A = sc.next ( )
        print ( solve ( ) )
    def solve ( ) :
        if len ( A ) == 1 : return 1
        ans = 0
        cnt = [ 0 ] * 26
        A = A [ : ]
        for i in range ( len ( A ) - 1 , - 1 , - 1 ) :
            c = A [ i ] - 'a'
            n = len ( A ) - i - 1
            ans += n - cnt [ c ]
            cnt [ c ] += 1
        return ans + 1
    from itertools import repeat
    class FastScanner ( Scanner ) :
        def readline ( self ) :
            if not isinstance ( self , next ) or not isinstance ( self , next ) :
                try :
                    self.next = next ( )
                except StopIteration :
                    raise StopIteration
            return next ( self )
        def readline ( self ) :
            if not isinstance ( self , next ) or not isinstance ( self , next ) :
                try :
                    self.next = next ( )
                except StopIteration :
                    raise StopIteration
            return self.next ( )
        def readline ( self ) :
            if not isinstance ( self , next ) or not isinstance ( self , next ) :
                try :
                    return self.next ( )
                except StopIteration :
                    raise StopIteration
            return self.next ( )
        def readline ( self ) :
            if not isinstance ( self , next ) or not isinstance ( self , next ) :
                try :
                    return self.next ( )
                except StopIteration :
                    raise StopIteration
            return self.next ( )
        def readline ( self ) :
            return next ( self )
        def __next__ ( self ) :
            return next ( self )
        def int ( self ) :
            return int ( self )
        def double ( self ) :
            return double ( self )
        def next_tuple ( self ) :
            a = [ ]
            for i in range ( self.n ) :
                a.append ( next_tuple ( self ) )
            return a
return Main
