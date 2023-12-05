def main ( ) :
    import sys
    import random
    import string
    import string
    import random
    import string
    import random
    import sys
    class A ( string ) :
        def __init__ ( self ) :
            self.T = random.randint ( 1 , T )
            self.nextcase :
                for zz in range ( 1 , T + 1 ) :
                    R = random.randint ( 1 , R )
                    C = random.randint ( 1 , C )
                    G = [ [ ] for _ in range ( R ) ]
                    for S in string.ascii_lowercase :
                        for c in string.digits :
                            if c == '.' :
                                G [ S ].append ( EMPTY )
                            elif c == '<' :
                                G [ S ].append ( LEFT )
                            elif c == '>' :
                                G [ S ].append ( RIGHT )
                            elif c == 'v' :
                                G [ S ].append ( DOWN )
                            elif c == '^' :
                                G [ S ].append ( UP )
                    self.ans = 0
                    for r in range ( R ) :
                        for c in string.ascii_lowercase :
                            if G [ r ] [ c ] == EMPTY :
                                continue
                            ok = [ ]
                            any = False
                            for d in range ( 4 ) :
                                nr = r + dr [ d ]
                                nc = c + dc [ d ]
                                ok.append ( False )
                                while 0 <= nr < R and 0 <= nc < C :
                                    if G [ nr ] [ nc ] != EMPTY :
                                        ok.append ( True )
                                        any = True
                                        break
                                    nr += dr [ d ]
                                    nc += dc [ d ]
                            if not any :
                                print ( "Case #%d: IMPOSSIBLE\n" % ( zz ) )
                                continue self.nextcase
                            if not ok [ G [ r ] [ c ] - 1 ] :
                                ans += 1
                print ( "Case #%d: %d\n" % ( zz , ans ) )
    dr = [ - 1 , 0 , 1 , 0 ]
    dc = [ 0 , - 1 , 1 ]
    A ( dr )
    A ( dc )
