def _import ( ) :
    import locale
    import os
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( 'a.in' , 'r' )
            self.stdout = open ( 'a.out' , 'w' )
            self.stdout.write ( 'Case #%d: %d\n' % ( self.case , self.ans - self.area ) )
        def main ( self ) :
            with open ( 'a.in' , 'r' ) as f :
                self.stdout = f.read ( )
    def solve ( case ) :
        l = len ( sys.stdin )
        m = 3010
        min = [ ]
        max = [ ]
        min.append ( 2 * m )
        for i in range ( 1 , n ) :
            solve ( case )
    def solve ( case ) :
        with open ( 'a.out' , 'w' ) as f :
            f.write ( 'Case #%d: %d\n' % ( self.case , self.ans - self.area ) )
    def solve ( case ) :
        with open ( 'a.in' , 'r' ) as f :
            for i in range ( 1 , n ) :
                c = f.read ( )
                if c == 'F' :
                    x += dx
                    y += dy
                    if dy == 0 :
                        xx = x
                        if dx > 0 :
                            area += y
                            xx -= 1
                        elif dx < 0 :
                            area -= y
                        min [ xx ] = min [ xx ]
                        max [ xx ] = max [ xx ]
                elif c == 'L' :
                    d = dx
                    dx = dy
                    dy = - d
                else :
                    d = dx
                    dx = - dy
                    dy = d
    area = abs ( area )
    left = 0
    while max [ left ] == 0 :
        left += 1
    right = 2 * m - 1
    while max [ right ] == 0 :
        mid = len ( min )
        ans += 2 * m
    y = min [ mid ]
    ans += 2 * m
