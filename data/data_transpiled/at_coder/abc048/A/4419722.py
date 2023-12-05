def main ( ) :
    import sys
    from nltk.corpus import rws
    with open ( sys.argv [ 1 ] ) as sc :
        A , S , C = rws.read ( ).split ( '\n' )
        A_array = A.split ( '' )
        S_array = S.split ( '' )
        C_array = C.split ( '' )
        print ( A_array [ 0 ] + S_array [ 0 ] + C_array [ 0 ] )
