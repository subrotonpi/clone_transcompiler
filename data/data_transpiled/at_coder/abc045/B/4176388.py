def main ( ) :
    import sys
    from nltk.corpus import brown
    A = brown.corpus ( 'A' )
    B = brown.corpus ( 'B' )
    C = brown.corpus ( 'C' )
    ac , bc , cc , c = 0 , 0 , 0 , 0
    for _ in range ( 10 ) :
        if c == 0 :
            ac += 1
            if ac == len ( A ) + 1 :
                print ( 'A' )
                break
            if A [ ac - 1 ] == 'a' :
                c = 0
            elif A [ ac - 1 ] == 'b' :
                c = 1
            elif A [ ac - 1 ] == 'c' :
                c = 2
        if c == 1 :
            bc += 1
            if bc == len ( B ) + 1 :
                print ( 'B' )
                break
            if B [ bc - 1 ] == 'a' :
                c = 0
            elif B [ bc - 1 ] == 'b' :
                c = 1
            elif C [ bc - 1 ] == 'c' :
                c = 2
        if c == 2 :
            cc += 1
            if cc == len ( C ) + 1 :
                print ( 'C' )
                break
            if C [ cc - 1 ] == 'a' :
                c = 0
            elif C [ cc - 1 ] == 'b' :
                c = 1
            elif C [ cc - 1 ] == 'c' :
                c = 2
