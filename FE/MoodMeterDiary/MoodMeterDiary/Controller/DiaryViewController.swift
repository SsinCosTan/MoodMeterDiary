//
//  DiaryViewController.swift
//  MoodMeterDiary
//
//  Created by minsong kim on 1/23/24.
//

import UIKit

class DiaryViewController: UIViewController {
    let happyLabel: UILabel = {
        let label = UILabel()
        label.font = .preferredFont(forTextStyle: .title3)
        label.text = "HAPPINESS"
        
        return label
    }()
    
    let happyDescriptionLabel: UILabel = {
        let label = UILabel()
        label.font = .preferredFont(forTextStyle: .body)
        label.text = """
                     오늘 당신이 느낀 행복감의 정도는 어디인가요?
                     자주, 많이 기뻤나요?
                     하루의 삶이 만족스러웠나요?
                     아니면 생각이 많고, 마음이 무거웠나요?
                     """
        label.numberOfLines = 0
        label.textAlignment = .center
        
        return label
    }()
    
    let energyLabel: UILabel = {
        let label = UILabel()
        label.font = .preferredFont(forTextStyle: .title3)
        label.text = "ENERGY"
        
        return label
    }()
    
    let energyDescriptionLabel: UILabel = {
        let label = UILabel()
        label.font = .preferredFont(forTextStyle: .body)
        label.text = """
                     오늘 당신의 에너지는 얼마만큼이었나요?
                     하루 종일 많은 것들을 할 힘이 남아돌았나요?
                     뛰어다니진 않아도 가벼운 발걸음이었나요?
                     아니면 기운이 없고 아무것도 하기 싫었나요?
                     """
        label.numberOfLines = 0
        label.textAlignment = .center
        
        return label
    }()
    
    let happySlider: UISlider = {
        let slider = UISlider()
        slider.minimumValue = 0
        slider.maximumValue = 10
        slider.value = 5
        slider.maximumValueImage = UIImage(systemName: "hand.thumbsup.fill")
        slider.minimumValueImage = UIImage(systemName: "hand.thumbsdown.fill")
        slider.translatesAutoresizingMaskIntoConstraints = false
        
        return slider
    }()
    
    let energySlider: UISlider = {
        let slider = UISlider()
        slider.minimumValue = 0
        slider.maximumValue = 10
        slider.value = 5
        slider.maximumValueImage = UIImage(systemName: "sun.max.fill")
        slider.minimumValueImage = UIImage(systemName: "cloud.drizzle.fill")
        slider.translatesAutoresizingMaskIntoConstraints = false
        
        return slider
    }()
    
    let submitButton: UIButton = {
        let button = UIButton()
        button.setTitle("제출하기", for: .normal)
        button.backgroundColor = .gray
        
        return button
    }()
    
    let happyStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.axis = .vertical
        stackView.alignment = .center
        stackView.spacing = 8
        
        return stackView
    }()
    
    let energyStackView: UIStackView = {
        let stackView = UIStackView()
        stackView.axis = .vertical
        stackView.alignment = .center
        stackView.spacing = 8
        
        return stackView
    }()
    
    let stackView: UIStackView = {
        let stackView = UIStackView()
        stackView.translatesAutoresizingMaskIntoConstraints = false
        stackView.axis = .vertical
        stackView.distribution = .equalSpacing
        
        return stackView
    }()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        view.backgroundColor = .systemBackground
        view.addSubview(stackView)
        
        configureStackView()
        configureSlider()
//        configureLabel()
    }
    
    func configureStackView() {
        happyStackView.addArrangedSubview(happyLabel)
        happyStackView.addArrangedSubview(happyDescriptionLabel)
        happyStackView.addArrangedSubview(happySlider)
        energyStackView.addArrangedSubview(energyLabel)
        energyStackView.addArrangedSubview(energyDescriptionLabel)
        energyStackView.addArrangedSubview(energySlider)
        
        stackView.addArrangedSubview(happyStackView)
        stackView.addArrangedSubview(energyStackView)
        stackView.addArrangedSubview(submitButton)
        
        NSLayoutConstraint.activate([
            stackView.leadingAnchor.constraint(equalTo: view.safeAreaLayoutGuide.leadingAnchor, constant: 32),
            stackView.trailingAnchor.constraint(equalTo: view.safeAreaLayoutGuide.trailingAnchor, constant: -32),
            stackView.topAnchor.constraint(equalTo: view.safeAreaLayoutGuide.topAnchor, constant: 50),
            stackView.bottomAnchor.constraint(equalTo: view.safeAreaLayoutGuide.bottomAnchor, constant: -100)
        ])
    }
    
    func configureSlider() {
        NSLayoutConstraint.activate([
            happySlider.leadingAnchor.constraint(equalTo: stackView.leadingAnchor),
            happySlider.trailingAnchor.constraint(equalTo: stackView.trailingAnchor),
            energySlider.leadingAnchor.constraint(equalTo: stackView.leadingAnchor),
            energySlider.trailingAnchor.constraint(equalTo: stackView.trailingAnchor)
        ])
    }
}
