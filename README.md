# clone_transcompiler
Code for paper, "Pathways to Leverage Transcompiler based Data Augmentation for Cross-Language Clone Detection", ICPC 2023


### Links to the required model and other repositories
- Pre-trained model
  - [Transcoder: Unsupervised Translation of Programming Languages](https://github.com/facebookresearch/CodeGen/blob/main/docs/transcoder.md)
- Cross-Language Clone Detection Models
  - [CLCDSA: Cross-Language Code Clone Detection using Syntactical Features and API Documentation](https://github.com/Kawser-nerd/CLCDSA)
  - [C4: Contrastive Cross-Language Code Clone Detection](https://github.com/Chenning-Tao/C4)
- Graph Matching Network for single-language clones
  - [GMN: Detecting Code Clones with Graph Neural Network and Flow-Augmented Abstract Syntax Tree](https://github.com/jacobwwh/graphmatch_clone)
- Parsers:
  - [Javalang](https://github.com/c2nes/javalang)
  - [srcML](https://www.srcml.org/)



- Install the dependencies from
  - install_server.sh
  - srcml_dep.sh
- Details about setting up ANTLR, Transcoder can be found in: 
  - setup_antlr.txt
  -  setup_transcoder.txt
-  Code fragments are already translated and stored
-  To get the clone-pairs and dataset generation
   -  run the notebooks sequentially and the dependency in between, such as -
      -   feature extraction using ANTLR (find in CLCDSA repo)
      -   use clone-pairs generation method provided in CLCDSA repo (requires Java)

-  To run the models
   - Install requirements.txt
   - Use a virtual environment and follow specific requirements from the target model's repository
  
### Contact
 Subroto Nag Pinku, subroto.npi@usask.ca
