def import import sys
class cards ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.ntc = len ( self.stdin )
    for cc in range ( 1 , ntc + 1 ) :
        c = [ ]
        s = [ ]
        t = [ ]
        n = len ( self.stdin )
        for i in range ( n ) :
            c.append ( self.stdin.read ( ) )
            s.append ( self.stdin.read ( ) )
            t.append ( self.stdin.read ( ) )
        m = len ( self.stdin )
        for i in range ( n , n + m ) :
            c.append ( self.stdin.read ( ) )
            s.append ( self.stdin.read ( ) )
            t.append ( self.stdin.read ( ) )
        mscore = 0
        for cmax in range ( n , n + m + 1 ) :
            hand = n
            turns = 1
            score = 0
            played = [ ]
            cont = True
            while ( turns > 0 ) and cont :
                cont = False
                for i in range ( hand ) :
                    if ( not played [ i ] ) and ( t [ i ] > 0 ) :
                        played [ i ] = True
                        cont = True
                        hand += c [ i ]
                        if hand > n + m :
                            hand = n + m
                        score += s [ i ]
                        turns += t [ i ] - 1
                msc = - 1
                msi = - 1
                for i in range ( hand ) :
                    if ( not played [ i ] ) and ( s [ i ] > msc ) and ( ( c [ i ] > 0 ) or ( hand >= cmax ) ) :
                        msi = i
                        msc = s [ i ]
                    if msi >= 0 :
                        played [ msi ] = True
                        cont = True
                        hand += c [ msi ]
                        if hand > n + m :
                            hand = n + m
                        score += s [ msi ]
                        turns += t [ msi ] - 1
            if score > mscore :
                self.stdout.write ( "Case #%d: %d\n" % ( cc , mscore ) )
            