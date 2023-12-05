# clone_transcompiler
Code for paper, "Pathways to Leverage Transcompiler based Data Augmentation for Cross-Language Clone Detection", ICPC 2023


## Installation

To set up the project, follow these steps:

1. Install dependencies by executing the following scripts:
   - `install_server.sh`
   - `srcml_dep.sh`
   - `requirements.txt`

## Model Training and Testing

To train or test the models, it is recommended to use a virtual environment. Follow the specific requirements outlined in the `requirements.txt` file. For additional model-specific instructions, refer to the repository of the target model.

## Setting up ANTLR and Transcoder

Detailed instructions for setting up ANTLR and Transcoder can be found in the following files:
   - `setup_antlr.txt`
   - `setup_transcoder.txt`

## Clone Pairs and Dataset Generation

To generate clone pairs and datasets, follow these steps:

1. Run the provided notebooks sequentially, ensuring dependencies are met, such as:
   - Feature extraction using ANTLR (find in CLCDSA repo)
   - Utilize the clone pairs generation method provided in the CLCDSA repo (requires Java)

For more information, refer to the respective repositories and documentation.

### Links to the required models and other repositories
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


  
### Contact
 Subroto Nag Pinku, subroto.npi@usask.ca
