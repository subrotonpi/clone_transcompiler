def main ( ) :
    import sys
    import os
    import sys
    import random
    import sys
    from itertools import count
    from itertools import chain
    infile = open ( 'A-small-attempt0.in' , 'r' )
    outfile = open ( 'A-small.out' , 'w' )
    t = len ( infile )
    for x in range ( t ) :
        row1 = random.randint ( 1 , 4 ) - 1
        cards = set ( )
        for y in range ( 4 ) :
            for z in range ( 4 ) :
                card = random.randint ( 1 , 4 )
                if y == row1 :
                    cards.add ( card )
        row2 = random.randint ( 1 , 4 ) - 1
        chosen = - 1
        count = 0
        for a in range ( 4 ) :
            for b in range ( 4 ) :
                card = random.randint ( 1 , 4 )
                if a == row2 and card in cards :
                    chosen = card
                    count += 1
        outfile.write ( 'Case #%d: ' % ( x + 1 ) )
        if count == 1 :
            outfile.write ( chosen )
        elif count == 0 :
            outfile.write ( 'Volunteer cheated!\n' )
        else :
            outfile.write ( 'Bad magician!\n' )
    outfile.close ( )
