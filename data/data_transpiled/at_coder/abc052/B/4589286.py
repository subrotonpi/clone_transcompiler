def main ( ) :
    import sys
    from nltk.corpus import brown
    input = brown.decode ( 'utf-8' )
    word = input.split ( )
    value = 0
    max = 0
    for char in word :
        if char == 'I' :
            value += 1
        else :
            value -= 1
        max = max ( value , value )
    print ( max )
