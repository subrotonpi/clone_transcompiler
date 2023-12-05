def round_b2013 ( ) :
    import sys
    from itertools import repeat
    from random import randint
    from random import choice
    class A ( object ) :
        def __init__ ( self ) :
            self.next = randint ( )
        def __next__ ( self ) :
            while not self.next or not self.next :
                self.next = __next__ ( )
            return self.next
        def __next__ ( self ) :
            return int ( self.next )
        def __next__ ( self ) :
            return long ( self.next )
        def nextDouble ( self ) :
            return float ( self.next )
        def solve ( ) :
            a = randint ( )
            n = randint ( )
            s = [ randint ( ) for i in range ( n ) ]
            s.sort ( )
            ans = [ [ a ] for a in range ( n + 1 ) ]
            for i in range ( n ) :
                for get in range ( len ( ans ) ) :
                    if ans [ i ] [ get ] == 0 : continue
                    if get + 1 <= n :
                        ans [ i + 1 ] [ get + 1 ] = max ( ans [ i + 1 ] [ get + 1 ] , ans [ i ] [ get ] )
                    now = ans [ i ] [ get ]
                    if now == 1 : continue
                    cnt = 0
                    while now <= s [ i ] :
                        cnt += 1
                        now = 2 * now - 1
                    if get + cnt <= n :
                        ans [ i + 1 ] [ get + cnt ] = max ( ans [ i + 1 ] [ get + cnt ] , now + s [ i ] )
            for i in range ( n + 1 ) :
                if ans [ n ] [ i ] != 0 :
                    print ( i )
                    return
    def solve ( ) :
        try :
            f = open ( 'input.txt' , 'r' )
            out = open ( 'output.txt' , 'w' )
            t = randint ( )
            for i in range ( t ) :
                print ( 'Case #%d: ' % ( i + 1 ) , end = '' )
                solve ( )
        except IOError :
            pass
    return solve
