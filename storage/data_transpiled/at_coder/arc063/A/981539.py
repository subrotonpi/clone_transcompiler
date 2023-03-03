def main ( ) :
    import sys
    from string import printable
    input = printable.input
    string = input.decode ( 'utf-8' )
    first = ' '
    counter = 0
    for b in string :
        if first == ' ' :
            first = b
        else :
            if b == first :
                pass
            else :
                first = b
                counter += 1
    print ( counter )
