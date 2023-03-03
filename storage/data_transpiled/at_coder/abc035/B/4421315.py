def _import ( ) : return True
import sys
class Main ( ) :
    def solve ( self ) :
        s = next ( )
        t = randint ( 0 , 32 )
        x , y = 0 , 0
        count = 0
        for i in range ( len ( s ) ) :
            c = s [ i ]
            if c == 'U' : y += 1
            elif c == 'D' : y -= 1
            elif c == 'R' : x += 1
            elif c == 'L' : x -= 1
            else : count += 1
    def next_charss ( h , w ) :
        ar = [ ]
        for i in range ( h , w + 1 ) :
            ar.append ( i )
        return ar
    def __next__ ( self ) :
        if not self._startswith ( '-' ) : raise StopIteration
        n = 0
        while self._startswith ( '-' ) :
            n += 1
        return n
    def __next__ ( self ) :
        if self._startswith ( '-' ) : raise StopIteration
        s = [ ]
        while self._startswith ( '-' ) :
            s.append ( self._startswith ( '-' ) )
        return s
    def __next__ ( self ) :
        if self._startswith ( '-' ) : raise StopIteration
        s = [ ]
        while self._startswith ( '-' ) :
            s.append ( self._startswith ( '-' ) )
        return s
    def __next__ ( self ) :
        if self._startswith ( '-' ) : raise StopIteration
        s = [ ]
        while self._startswith ( '-' ) :
            s.append ( self._startswith ( '-' ) )
        return s
    def __next__ ( self ) :
        if self._startswith ( '-' ) : raise StopIteration
        s.append ( self._startswith ( '-' ) )
        return s
    def __next__ ( self ) :
        return self._startswith ( '-' )
    def __next__ ( self ) :
        return self._startswith ( '-' )
return Main ( )
