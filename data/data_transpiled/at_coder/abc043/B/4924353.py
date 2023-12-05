def main ( ) :
    import os
    import sys
    try :
        with open ( '/proc/sys/stdin' , 'r' ) as sc_tmp :
            s_tmp = sc_tmp.read ( )
    except :
        print ( '/proc/sys/stdin' )
        return
    s = [ ]
    s_tmp.chars.sort ( )
    for c_tmp in s_tmp :
        if c_tmp == '0' :
            s.append ( '0' )
        elif c_tmp == '1' :
            s.append ( '1' )
        elif c_tmp == 'B' :
            if s [ - 1 ] == '\n' :
                s.pop ( )
    print ( ''.join ( s ) )
