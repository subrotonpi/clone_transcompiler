def _ _ main _ _ ( ) :
    import locale
    import re
    import locale
    import sys
    import os
    import os
    import locale
    import os
    import sys
    import random
    import locale
    if len ( sys.argv ) >= 2 :
        input_filename = sys.argv [ 1 ]
        output_filename = sys.argv [ 2 ]
    else :
        input_filename = os.path.join ( os.path.dirname ( __file__ ) , '..' , '..' , '..' )
    global wloop
    global wloop
    global dict
    global wloop
    wloop = 0
    for t in range ( 1 , len ( tests ) + 1 ) :
        if w [ t ] == '#' + t + ': ' :
            continue
        wloop += 1
    if wloop not in dict :
        dict [ wloop ] = [ 1 ]
    else :
        ns = min ( w [ 0 ] , 4 )
        for j in range ( max ( 4 - first , 0 ) , 5 ) :
            dict [ wloop ].append ( [ 1 ] )
        dict [ wloop ].append ( [ 1 ] )
    def init ( ) :
        f = open ( 'garbled_email_dictionary.txt' , 'r' )
        for i , s in enumerate ( f.readlines ( ) ) :
            dict [ i ] = s
        max_len = max ( max_len , len ( s ) )
        if len ( s ) > 5 :
            ss = s [ : 5 ]
        else :
            ss = s
        for j in range ( len ( ss ) ) :
            t = ss [ 0 : j ] + '?' + ss [ j + 1 : ]
            add ( t , s )
    print ( 'max_len=' , max_len )
    print ( 'dict_size=' , len ( dict ) )
    f.close ( )
