def main ( ) :
    import sys
    from os.path import join
    keyboard = raw_input ( "Please enter a file or directory" )
    s = keyboard.next ( )
    command = [ ]
    result = [ ]
    for i in s :
        command.append ( i )
    jj = 0
    count = 1
    for j in range ( len ( s ) - 1 , - 1 , - 1 ) :
        if command [ j ] == "B" :
            while j != 0 and command [ j - 1 ] == "B" :
                count += 1
                j -= 1
            j -= count
        else :
            result.append ( command [ j ] )
            jj += 1
    for k in range ( jj - 1 , 0 , - 1 ) :
        sys.stdout.write ( result [ k ] )
    keyboard.close ( )
