def main ( ) :
    import sys
    from nltk.corpus import brown
    with open ( 'input.txt' , 'r' ) as f :
        input = f.read ( )
    result = solve ( input )
    print ( result )
