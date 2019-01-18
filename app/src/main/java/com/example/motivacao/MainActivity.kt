package com.example.motivacao

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView

    var fundos = arrayOf("#39add1", "#3079ab", "#c25975", "#e15258", "#f9845b", "#838cc7", "#7d669e", "#53bbb4", "#51b46d", "a#e0ab18", "#637a91", "#f092b0")

    val frases = arrayOf(
        "Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todosb – James Cameron",

        "O sucesso normalmente vem para quem está ocupado demais para procurar por ele – Henry David Thoreau",

        "A vida é melhor para aqueles que fazem o possível para ter o melhor – John Wooden",

        "Os empreendedores falham, em média, 3,8 vezes antes do sucesso final. O que separa os bem-sucedidos dos outros é a persistência – Lisa M. Amos",

        "Se você não está disposto a arriscar, esteja disposto a uma vida comum – Jim Rohn",

        "Escolha uma ideia. Faça dessa ideia a sua vida. Pense nela, sonhe com ela, viva pensando nela. Deixe cérebro, músculos, nervos, todas as partes do seu corpo serem preenchidas com essa ideia. Esse é o caminho para o sucesso – Swami Vivekananda",

        "Para de perseguir o dinheiro e comece a perseguir o sucesso – Tony Hsieh",

        "Todos os seus sonhos podem se tornar realidade se você tem coragem para persegui-los – Walt Disney",

        "Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo – Winston Churchill",

        "Sempre que você vir uma pessoa de sucesso, você sempre verá as glórias, nunca os sacrifícios que os levaram até ali – Vaibhav Shah",

        "Sucesso? Eu não sei o que isso significa. Eu sou feliz. A definição de sucesso varia de pessoa para pessoa Para mim, sucesso é paz anterior – Denzel Washington",

        "Oportunidades não surgem. É você que as cria – Chris Grosser",

        "Não tente ser uma pessoa de sucesso. Em vez disso, seja uma pessoa de valor – Albert Einstein",

        "Não é o mais forte que sobrevive, nem o mais inteligente. Quem sobrevive é o mais disposto à mudança – Charles Darwin",

        "A melhor vingança é um sucesso estrondoso – Frank Sinatra",

        "Eu não falhei. Só descobri 10 mil caminhos que não eram o certo – Thomas Edison",

        "Um homem de sucesso é aquele que cria uma parede com os tijolos que jogaram nele – David Brinkley",

        "Ninguém pode fazer você se sentir inferior sem o seu consentimento – Eleanor Roosevelt",

        "O grande segredo de uma boa vida é encontrar qual é o seu destino. E realizá-lo – Henry Ford",

        "Se você está atravessando um inferno, continue atravessando – Churchill",

        "O que nos parece uma provação amarga pode ser uma bênção disfarçada – Oscar Wilde",

        "A distância entre a insanidade e a genialidade é medida pelo sucesso – Bruce Feirstein",

        "Não tenha medo de desistir do bom para perseguir o ótimo – John D. Rockefeller",

        "A felicidade é uma borboleta que, sempre que perseguida, parecerá inatingível; no entanto, se você for paciente, ela pode pousar no seu ombro – Nathaniel Hawthorne",

        "Se você não pode explicar algo de forma simples, então você não entendeu muito bem o que tem a dizer – Einstein",

        "Há dois tipos de pessoa que vão te dizer que você não pode fazer a diferença neste mundo: as que têm medo de tentar e as que têm medo de que você se dê bem – Ray Goforth",

        "Comece de onde você está. Use o que você tiver. Faça o que você puder – Arthur Ashe",

        "As pessoas me perguntam qual é o papel que mais gostei de interpretar. Eu sempre respondo: o próximo – Kevin Kline",

        "Descobri que, quanto mais eu trabalho, mais sorte eu pareço ter – Thomas Jefferson",

        "O ponto de partida de qualquer conquista é o desejo – Napoleon Hill",

        "O sucesso é a soma de pequenos esforços repetidos dia após dia – Robert Collier",

        "Todo progresso acontece fora da zona de conforto – Michael John Bobak",

        "Coragem é a resistência e o domínio do medo, não a ausência dele – Mark Twain",

        "Só evite fazer algo hoje se você quiser morrer e deixar assuntos inacabados – Pablo Picasso",

        "O único lugar em que o sucesso vem antes do trabalho é no dicionário – Vidal Sassoon",

        "Não sei qual é a chave para o sucesso, mas a chave para o fracasso é tentar agradar a todos – Bill Cosby",

        "Embora ninguém possa voltar atrás e começar tudo de novo, qualquer um pode ter um ótimo final – Carl Bard",

        "Descobri que, se você tem vontade de viver e curiosidade, dormir não é a coisa mais importante – Martha Stewart",

        "Daqui a vinte anos, você não terá arrependimento das coisas que fez, mas das que deixou de fazer. Por isso, veleje longe do seu porto seguro. Pegue os ventos. Explore. Sonhe. Descubra – Twain",

        "O primeiro passo rumo ao sucesso é dado quando você se recusa ao ser um refém do ambiente em que se encontra – Mark Caine",

        "Sempre que você se encontrar do lado da maioria, é hora de parar e refletir – Twain",

        "Continue andando. Haverá a chance de você ser barrado por um obstáculo, talvez por algo que você nem espere. Mas siga, até porque eu nunca ouvi falar de ninguém que foi barrado enquanto estava parado – Charles F. Kettering",

        "Se você realmente quer algo, não espere. Ensine você mesmo a ser impaciente – Gurbaksh Chahal",

        "Se você quer uma mudança permanente, pare de focar no tamanho de seus problemas e comece a focar no seu tamanho! – T. Harv Eker",

        "Pessoas de sucesso fazem o que pessoas mal sucedidas não querem fazer. Não queira que a vida seja mais fácil. Deseje que você seja ainda melhor – Rohn",

        "A primeira razão para o fracasso de alguém é escutar amigos, família e vizinhos – Hill",

        "O sucesso não consiste em não errar, mas não cometer os mesmos equívocos mais de uma vez – George Bernard Shaw",

        "A motivação é o que faz o empreendedor começar e o hábito é o que nos faz continuar – Jim Rynn",

        "Nosso maior medo não deve ser o fracasso, mas ser bem-sucedidos em algo que não importa – Francis Chan",

        "Se você não traçou um plano para você mesmo, é possível que você caia no plano de outra pessoa. E adivinha o que ele planejou para você? Não muito – Rohn",

        "Você deve lutar mais de uma batalha para se tornar um vencedor – Margaret Thatcher",

        "Eu devo meu sucesso a meu hábito de respeitosamente ouvir conselhos e fazer exatamente o contrário – G. K. Chesterton",

        "Muitas das falhas da vida ocorrem quando não percebemos o quão próximos estávamos do sucesso na hora em que desistimos – Edison",

        "Quanto maior o artista, maior a dúvida. Confiança grande demais é algo destinados aos menos talentosos como um prêmio de consolação – Robert Hughes",

        "Uma fórmula para o sucesso? É bem simples, na verdade: dobre a probabilidade de fracasso da sua empresa. Você pensa que a falha é um inimigo do sucesso. Mas não é, de jeito nenhum. Você pode ser desencorajado com os erros ou aprender com eles, então siga em frente e continue falhando. Erre o máximo que puder. É aí que você vai conseguir o sucesso – Thomas J. Watson",

        "Tenha em mente que o seu desejo em atingir o sucesso é mais importante que qualquer coisa – Abraham Lincoln",

        "Fique contente em agir. Deixe a fala para os outros – Baltasar Gracián",

        "Para conquistar o sucesso, você precisa aceitar todos os desafios que vierem na sua frente. Você não pode apenas aceitar os que você preferir – Mike Gafka",

        "O guerreiro de sucesso é um homem médio, mas com um foco apurado como um raio laser – Bruce Lee",

        "A lógica pode levar de um ponto A a um ponto B. A imaginação pode levar a qualquer lugar – Einstein"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.novoTexto)
    }

    fun Clique(view: View) {

        val tamanhoArray = frases.size
        val numeroAleatorio = java.util.Random().nextInt(tamanhoArray)

        texto.setText(frases[numeroAleatorio])

        val tamanhofundos = fundos.size
        val random = java.util.Random().nextInt(tamanhofundos)
        val pick = fundos.get(random)
        val cor = Color.parseColor(pick)
        tela.setBackgroundColor(cor)

    }

    fun Compartilhar(view: View){

        val mensagem = texto.text.toString()

        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT ,mensagem )
        intent.type = "text/plain"
        startActivity(Intent.createChooser(intent, "Compartilhar"))

    }
}
