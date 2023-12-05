def main ( ) :
    import sys
    from string import printable
    sc = open ( '/proc/stab' , 'r' )
    arr = sc.read ( ).split ( )
    lines = [ ]
    for i in range ( len ( arr ) ) :
        if i != 0 :
            lines.append ( ' ' )
        if arr [ i ] == 'Left' :
            lines.append ( '<' )
        elif arr [ i ] == 'Right' :
            lines.append ( '>' )
        else :
            lines.append ( 'A' )
    print ( '\n'.join ( lines ) )
