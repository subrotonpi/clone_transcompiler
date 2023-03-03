def main ( ) :
    import sys
    from string import printable
    a = printable.read ( )
    A , B , C , D , E , F = [ ] , [ ] , [ ] , [ ]
    for b in printable.split ( a ) :
        if b == 'A' :
            A += 1
        elif b == 'B' :
            B += 1
        elif b == 'C' :
            C += 1
        elif b == 'D' :
            D += 1
        elif b == 'E' :
            E += 1
        elif b == 'F' :
            F += 1
    print ( A , B , C , D , E , F )
