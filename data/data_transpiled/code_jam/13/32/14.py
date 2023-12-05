def check ( infile ) :
    import math
    import os
    import os
    import os
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import rcode
    br_in = open ( infile )
    br_out = open ( 'br1' )
    br_out.write ( 'Case #' + str ( ca ) + ': ' + str ( msg ) + '\r\n' )
    ca = 1
    br_in.seek ( 0 )
    br_out.write ( 'Case #' + str ( ca ) + ': ' + str ( msg ) + '\n' )
    ca += 1
    br_out.close ( )
    for sline in br_out :
        fields = sline.split ( )
        print ( fields [ 0 ] , fields [ 1 ] , end = '' )
        x = y = 0
        for i , c in enumerate ( fields [ 2 : ] ) :
            if c == 'N' :
                y += i + 1
            elif c == 'S' :
                y -= i + 1
            elif c == 'W' :
                x -= i + 1
            else :
                x += i + 1
        print ( x , y )
    br_out.close ( )
    br_in = open ( infile )
    bw_out = open ( outfile , 'w' )
    br_out.write ( 'Case #' + str ( ca ) + ': ' + str ( msg ) + '\n' )
    br_out.close ( )
    for sline in br_out :
        fields = sline.split ( )
        x_o = int ( fields [ 0 ] )
        y_o = int ( fields [ 1 ] )
        tot = abs ( x_o ) + abs ( y_o )
        start = int ( math.floor ( math.sqrt ( float ( 2 * tot ) ) ) )
        dist = start * ( start + 1 ) / 2
        moves = start
        while ( dist - tot ) % 2 :
            moves += 1
            dist += moves
        b = ''
        curmove = moves
        x = x_o
        y = y_o
        while True :
            while curmove > 0 :
            INDENT