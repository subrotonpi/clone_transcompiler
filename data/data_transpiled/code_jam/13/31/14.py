def test_round_1_C_2013_A ( infile , outfile ) :
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import sys
    import time
    import string
    import string
    import string
    import string
    import string
    import string
    ca = 1
    br_in = open ( infile , 'r' )
    bw_out = open ( outfile , 'w' )
    for sline in br_in :
        fields = sline.split ( )
        if len ( fields ) != 2 :
            print ( 'skipping mis-parse: {}'.format ( sline ) )
            continue
        s = fields [ 0 ]
        n = int ( fields [ 1 ] )
        num_sets = 0
        seqnum = 0
        for i , c in enumerate ( s ) :
            if c not in [ 'a' , 'e' , 'i' , 'o' , 'u' ] :
                seqnum += 1
                if seqnum >= n :
                    starts.append ( i + 1 - n )
                    ends.append ( i + 1 )
                    num_sets += 1
            else :
                seqnum = 0
        last_start = - 1
        sum = 0
        for i in range ( num_sets ) :
            choicesLeft = starts [ i ] - last_start
            choicesRight = 1 + len ( s ) - ends [ i ]
            sum += int ( choicesLeft ) * int ( choicesRight )
            last_start = starts [ i ]
        msg = '{}'.format ( sum )
        print ( '{}'.format ( len ( s ) ) )
        bw_out.write ( 'Case #{}: {}\r\n'.format ( ca , msg ) )
        ca += 1
    br_in.close ( )
    bw_out.close ( )
