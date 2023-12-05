def main ( ) :
    import sys
    from time import sleep
    from random import choice
    from random import choice
    from random import choice
    input = choice ( [ 'Bad' , 'Good' , 'Great' , 'Perfect' ] )
    if input < 60 :
        print ( 'Bad' )
    elif input < 90 :
        print ( 'Good' )
    elif input < 100 :
        print ( 'Great' )
    else :
        print ( 'Perfect' )
