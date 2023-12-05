def main ( ) :
    import string
    from string import ascii_lowercase
    sc = Scanner ( )
    s = sc.next ( )
    t = sc.next ( )
    c = ascii_lowercase
    c = ( 'A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L' , 'M' , 'N' , 'O' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , 'Z' )
    cidx = 0
    for sca in s :
        if sca.islower ( ) :
            s = s.replace ( sca , c [ cidx ] )
            cidx += 1
    cidx = 0
    for sca in t :
        if sca.islower ( ) :
            t = t.replace ( sca , c [ cidx ] )
            cidx += 1
    print ( 'Yes' if s == t else 'No' )
