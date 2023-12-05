def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_words
    letters = [ 'NNE' , 'NE' , 'ENE' , 'E' , 'ESE' , 'SE' , 'SSE' , 'S' , 'SSW' , 'SW' , 'WSW' , 'W' , 'WNW' , 'NW' , 'NNW' , 'N' ]
    huuryoku = [ 0 , 15 , 93 , 201 , 327 , 477 , 645 , 831 , 1029 , 1245 , 1467 , 1707 , 1959 ]
    d = get_words ( brown )
    w = get_words ( brown )
    wp = 0
    for i in huuryoku :
        if i <= w :
            wp = i
    if not wp :
        print ( 'C 0' )
    else :
        print ( letters [ ( ( 10 * d + 1125 ) // 2250 + 15 ) % 16 ] % wp )
