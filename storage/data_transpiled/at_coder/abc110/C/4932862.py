def main ( ) :
    import sys
    from string import ascii_letters
    sc = sys.stdin
    s = sc.readlines ( )
    c = ascii_letters.replace ( 'A' , 'B' )
    c = [ 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L' , 'M' , 'N' , 'O' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , 'Z' ]
    for j in range ( 2 ) :
        cidx = 0
        for sca in s [ j ] :
            if sca.islower ( ) :
                s [ j ] = s [ j ].replace ( sca , c [ cidx ] )
                cidx += 1
    print ( 'Yes' if s [ 0 ] == s [ 1 ] else 'No' )
