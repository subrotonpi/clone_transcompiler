def main ( ) :
    import sys
    import os
    import itertools
    import os
    import scanner
    class LibraryA :
        def __init__ ( self ) :
            sc = scanner.Scanner
            def ns ( self ) :
                return sc.next ( )
            def nl ( self ) :
                return sc.next ( )
            def ni ( self ) :
                return sc.next ( )
            def ns ( self ) :
                for i in range ( self.r ) :
                    if self.m [ i ] [ j ] != '#' : continue
                    if self.i + 1 < self.c and self.m [ i ] [ j + 1 ] == '#' :
                        self.m [ i ] [ j ] = '\'
                        self.m [ i + 1 ] [ j + 1 ] = '\'
                        self.m [ i + 1 ] [ j + 1 ] = '\'
                    else :
                        possible = False
                        break
            def nl ( self ) :
                for i in range ( self.r ) :
                    for j in self.c :
                        self.m [ i ] = self.n
            def gcd ( self , a , b ) :
                if a < 0 : a = - a
                if b < 0 : b = - b
                while b != 0 :
                    t = b
                    b = a % b
                    a = t
                return a
            def swap ( self , a , b ) :
                m = self.m [ a ]
                self.m [ a ] = self.m [ b ]
                self.m [ b ] = m
        def next ( self ) :
            return self.next ( )
    cur = itertools.repeat ( 2 )
    while cur [ - 1 ] > cur [ - 1 ] :
        pos -= 1
        if pos < 0 : return False
    maxVal = cur [ - 1 ]
    i = cur [ - 1 ]
    if len ( cur ) < len ( cur ) :
        return False
    cur = itertools.repeat ( 1 )
    while cur [ - 1 ] > cur [ - 1 ] :
        cur = cur [ - 1 ]
    return cur
