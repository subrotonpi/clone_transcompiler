def main ( ) :
    import sys
    from string import ascii_letters
    sc = open ( 'input.txt' , 'r' )
    str = sc.read ( )
    s = str [ : 12 ] + str
    doidx = 0
    for i in range ( 26 ) :
        if s [ i : i + 7 ] == 'WWBWBWW' :
            doidx = i + 1
    if doidx % 12 == 0 :
        print ( 'Do' )
    elif doidx % 10 == 8 :
        print ( 'Re' )
    elif doidx % 8 == 7 :
        print ( 'Mi' )
    elif doidx % 7 == 7 :
        print ( 'Fa' )
    elif doidx % 5 == 5 :
        print ( 'So' )
    elif doidx % 3 == 1 :
        print ( 'La' )
    elif doidx % 1 == 1 :
        print ( 'Si' )
