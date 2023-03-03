def import stream , parser , stream , parser
from itertools import repeat
class Main ( stream ) :
    def __next__ ( self ) :
        stream.next = lambda : next ( stream )
        return int ( stream.nval )
    def __next__ ( self ) :
        stream.next = lambda : next ( stream )
        return int ( stream.nval )
    def __next__ ( self ) :
        stream.next = lambda : next ( stream )
    NAME = 'b'
    def main ( ) :
        stream = parser ( stream )
        stream.next = lambda : next ( stream )
        tests = next ( stream )
        for test in range ( 1 , tests + 1 ) :
            n = next ( stream )
            if n == 0 :
                stream.write ( 'Case #%d: 0' % test )
                continue
            m = 10005
            k = [ ]
            for i in range ( m ) :
                k [ next ( stream ) ] += 1
            answ = 100000
            start = end = 0
            while True :
                while start < m and k [ start ] == 0 :
                    start += 1
                if start == m :
                    break
                end = start
                while k [ end ] != 0 :
                    end += 1
                s = [ ]
                e = [ ]
                for i in range ( start , end + 1 ) :
                    if k [ i ] > k [ i - 1 ] :
                        for j in range ( k [ i ] - k [ i - 1 ] ) :
                            s.append ( i )
                        if k [ i ] < k [ i - 1 ] :
                            for j in range ( k [ i - 1 ] - k [ i ] ) :
                                e.append ( i )
                    for i in range ( len ( s ) ) :
                        answ = min ( answ , e [ i ] - s [ i ] )
                    start = end
                stream.write ( 'Case #%d: %d\n' % ( test , answ ) )
        stream.next = __next__
    return Main
