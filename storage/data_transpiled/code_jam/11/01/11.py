def package ( A ) :
    import os
    from itertools import count
    from itertools import count
    class BotTrust ( object ) :
        def __init__ ( self ) :
            self.stream = open ( "src/A/A-large.in" )
            s = self.stream.read ( )
            t = count ( s )
    class BotTrust ( object ) :
        def __init__ ( self ) :
            self.stream = open ( "src/A/output.txt" )
            for i in range ( t ) :
                s = self.stream.read ( )
                ss = s.split ( "s+" )
                n = count ( ss [ 0 ] )
                qo = Queue ( )
                qb = Queue ( )
                qcolor = Queue ( )
                po = 1
                pb = 1
                for j in range ( n ) :
                    color = ss [ j + j + 1 ] [ 0 ]
                    pos = int ( ss [ j + j + 2 ] )
                    qcolor.put ( color )
                    if color == "B" :
                        qb.put ( pos )
                    else :
                        qo.put ( pos )
            qo.put ( 1 )
            qb.put ( 1 )
            ans = 0
            while not qcolor.empty ( ) :
                color = qcolor.get ( )
                if color == "B" :
                    nb = qb.get ( )
                    moveb = abs ( pb - nb ) + 1
                    pb = nb
                    ans += moveb
                    no = qo.peek ( )
                    moveo = no - po
                    if abs ( moveo ) > moveb :
                        moveo = moveb * moveo / abs ( moveo )
                    po += moveo
                else :
                    no = qo.get ( )
                    moveo = abs ( po - no ) + 1
                    po = no
                    ans += moveo
                    nb = qb.get ( )
                    moveb = nb - pb
                    if abs ( moveb ) > moveo :
                        moveb = moveo * moveb / abs ( moveb )
                    pb += moveb
    return BotTrust
