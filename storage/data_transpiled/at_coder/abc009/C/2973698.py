def _import ( ) : return sys.stdin.read ( )
import tokenize
import tokenize
import string
import string
import sys
class Main ( ) :
    def __init__ ( self , stream ) :
        try :
            stream = tokenize.open ( stream )
        except tokenize.error :
            raise
    def readline ( self ) :
        if not stream or not stream :
            try :
                return stream.readline ( )
            except tokenize.error :
                raise
        return string.split ( next ( stream ) )
    def next_int64 ( self ) :
        return long ( next ( stream ) )
    def solve ( self ) :
        T = [ s for s in self.next ( ) ]
        last = [ 0 ] * 26
        for i in range ( self.N ) :
            last [ S [ i ] - 'a' ] += 1
        i = 0
        lo : while i < self.N :
            ch :
                for c in [ 'a' , 'z' ] :
                    if T [ i ] == c :
                        i += 1
                        last [ c - 'a' ] -= 1
                        continue
                    if last [ c - 'a' ] == 0 :
                        continue
                    for j in range ( i + 1 , self.N ) :
                        if T [ j ] == c :
                            swap ( T , i , j )
                            if self.count ( T , i ) > K :
                                swap ( T , i , j )
                            else :
                                i += 1
                                continue
            return string.join ( T , '' )
    def count ( self , T , fixed ) :
        d1 = 0
        for i in range ( 0 , self.fixed ) :
            if S [ i ] != T [ i ] :
                d1 += 1
        cnt_s = [ 0 ] * 26
        cnt_t = [ 0 ] * 26
        for i in range ( self.fixed + 1 , self.N ) :
            cnt_s [ S [ i ] - 'a' ] += 1
            cnt_t [ T [ i ] - 'a' ] += 1
        minsum = 0
        for i in range ( self.fixed ) :
            minsum += min ( cnt_s [